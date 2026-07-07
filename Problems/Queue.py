class Queue:
    def __init__(self):
        self.queue = []
    
    def enqueue(self, val):
        self.queue.append(val)
    
    def dequeue(self):
        return self.queue.pop(0)
    
    def size(self):
        return len(self.queue)
    
