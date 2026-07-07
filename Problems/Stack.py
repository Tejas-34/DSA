class Stack:
    def __init__(self):
        self.items = []
    
    def isEmpty(self):
        if len(self.items) == 0:
            return True
        return False

    def pop(self):
        if not(self.isEmpty()):
            return self.items.pop()
        
        print("Stack is Empty")
        return None

    def push(self, val):
        self.items.append(val)
    
    def peek(self):
        if not(self.isEmpty()):
            return self.items[-1]
        print("Stack is Empty")
        return None

    def size(self):
        return len(self.items)
    

stack = Stack()
stack.push(10)
stack.push(20)
stack.push(30)
stack.push(40)

print(stack.pop())
print(stack.pop())


print(stack.peek())
print(stack.pop())