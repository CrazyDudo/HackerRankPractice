import time
import asyncio
from types import coroutine

def display(num):
    print(num)
    time.sleep(1)

# for i in range(10):
#     display(i)  
 
""" async def display(num):
    await asyncio.sleep(1)
    print(num)
 """
coroutines = [display(num) for num in range(10)]

loop = asyncio.get_event_loop()
loop.run_until_complete(asyncio.wait(coroutines))
loop.close()






