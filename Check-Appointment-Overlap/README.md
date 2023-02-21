# Problem Statement

In a scheduling program, we want to check whether two appointments overlap. For simplicity, appointments start at a full hour, and we use military time (with hours 0–24).

The following pseudocode describes an algorithm that determines whether the appointment with start time start1 and end time end1 overlaps with the appointment with start time start2 and end time end2.

If start1 > start2:
    s = start1 
Else:
    s = start2
If end1 < end2:
    e = endl
Else:
    e = end2
If s < e:
    The appointments overlap.
Else:
    The appointments don’t overlap.

Trace this algorithm with each of the following:

● an appointment from 10–12 and one from 11–13
● an appointment from 10–11 and one from 12–13

### an appointment from 10–12 and one from 11–13: 

Output: 10 12 11 13

The appointments overlap.

Explanation:
● Here start1 = 10 and end1 = 12
● start2 = 11 and end2 = 13
● As the if statement start1 > start2 fails, it will go to the else block
and assign start2 value 11 to variable s.
● Then it compares end times which is end1 < end2, as this was true
if statement block gets executed and assigns end1 value 12 to
variable e.
● As the value of s is less than e if statement block is executed and
prints “The appointments overlap.”
● an appointment from 10–11 and one from 12–13 Output: 10 11 12 13
The appointments don't overlap.
Explanation:
● Here start1 = 10 and end1 = 11
● start2 = 12 and end2 = 13
● As the if statement start1 > start2 fails, it will go to the else block
and assign start2 value 12 to variable s.
● Then it compares end times which is end1 < end2, as this was true
if statement block gets executed and assigns end1 value 11 to
variable e.
● As the value of s is greater than e, the else statement block is
executed and prints “The appointments don't overlap.”