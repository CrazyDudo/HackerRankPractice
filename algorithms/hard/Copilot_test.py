'''
Function to get the max

'''
def get_max_min(mylist):
    max_value = max(my_list)
    min_value = min(my_list)
    return max_value, min_value


def main():
    my_list = [1,2,3,4,5]
    max_value, min_value = get_max_min(my_list)
    print("Max value:", max_value)
    print("Min value:", min_value)