class Node:
    def __init__(self, val=None):
        self.val = val
        self.next = None
        self.prev = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def append(self, val, next=None):
        node = Node(val)
        if not self.head:
            self.head = node
            return
        curr = self.head

        while(curr.next):
            curr = curr.next
        curr.next = node
        node.prev = curr

    
    def deletMiddle(self, val):
        curr = self.head
        while(curr.next.val != val):
            curr = curr.next
        
        temp = curr.next
        curr.next = temp.next
        temp.next.prev = curr
        del temp

    
    def print_list(self):
        curr = self.head
        while(curr):
            print(curr.val, end=' -> ')
            curr = curr.next
        print('None')

    def print_rev(self):
        curr = self.head
        while curr.next:
            curr = curr.next
        
        while curr:
            print(curr.val, end=' -> ')
            curr = curr.prev
        print('None')


head = LinkedList()
head.append(10)
head.append(20)
head.append(30)
head.append(40)
head.append(50)
head.append(60)

head.print_list()
head.deletMiddle(40)
head.print_list()
