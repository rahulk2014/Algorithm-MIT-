from random import randint;
import time


'''	
	Generate a list with a million random numbers.
'''
l = []
for i in range(0, 10000000):
	l.append(randint(1,1000));


# '''
# 	Linear Time Algorithm
# '''
# def linear_time():
# 	for i in range(0, len(l)):
# 		if i == 0:
# 			if l[i+1] < l[i]:
# 				print "Peak Found " + str(l[i]);
# 			 	break;
# 		elif (i == len(l)-1):
# 				if (l[i-1] < l[i]):
# 					print "Peak Found" + str(l[i]);
# 					break;
# 		else:
# 			if (l[i-1] < l[i] and l[i+1] < l[i]):
# 				print "Peak Found" + str(l[i]);
# 				break;

# def log_time(first, last):
# 	mid = (first + last)/2;
# 	if l[mid] < l[mid-1]:
# 		return log_time(first, mid-1);
# 	if l[mid] < l[mid+1]:
# 		return log_time(first, mid+1);

# 	return l[mid];


 
# #start_time = time.time();
# #linear_time();
# #print("--- %s-seconds---" %(time.time()- start_time));


 
# start_time = time.time();
# print log_time(0, 999999);
# print("--- %s-seconds---" %(time.time()- start_time));

