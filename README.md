# ConferenceTrackManagement
You are planning a big programming conference and have received many proposals which have passed the initial screen process but you're having trouble fitting them into the time constraints of the day -- there are so many possibilities! So you write a program to do it for you.

The conference has multiple tracks each of which has a morning and afternoon session.
Each session contains multiple talks.
Morning sessions begin at 9am and must finish by 12 noon, for lunch.
Afternoon sessions begin at 1pm and must finish in time for the networking event.
The networking event can start no earlier than 4:00 and no later than 5:00.
No talk title has numbers in it.
All talk lengths are either in minutes (not hours) or lightning (5 minutes).
Presenters will be very punctual; there needs to be no gap between sessions.

Note that depending on how you choose to complete this problem, your solution may give a different ordering or combination of talks into tracks. This is acceptable; you don’t need to exactly duplicate the sample output given here.

 Test input:
Writing Fast Tests Against Enterprise Rails 60min

Overdoing it in Python 45min

Lua for the Masses 30min

Ruby Errors from Mismatched Gem Versions 45min

Common Ruby Errors 45min

Rails for Python Developers lightning

Communicating Over Distance 60min

Accounting-Driven Development 45min

Woah 30min

Sit Down and Write 30min

Pair Programming vs Noise 45min

Rails Magic 60min

Ruby on Rails: Why We Should Move On 60min

Clojure Ate Scala (on my project) 45min

Programming in the Boondocks of Seattle 30min

Ruby vs. Clojure for Back-End Development 30min

Ruby on Rails Legacy App Maintenance 60min

A World Without HackerNews 30min

User Interface CSS in Rails Apps 30min


Test output: 

Track 1:

09:00AM Writing Fast Tests Against Enterprise Rails 60min

10:00AM Overdoing it in Python 45min

10:45AM Lua for the Masses 30min

11:15AM Ruby Errors from Mismatched Gem Versions 45min

12:00PM Lunch

01:00PM Ruby on Rails: Why We Should Move On 60min

02:00PM Common Ruby Errors 45min

02:45PM Pair Programming vs Noise 45min

03:30PM Programming in the Boondocks of Seattle 30min

04:00PM Ruby vs. Clojure for Back-End Development 30min

04:30PM User Interface CSS in Rails Apps 30min

05:00PM Networking Event


Track 2:

09:00AM Communicating Over Distance 60min

10:00AM Rails Magic 60min

11:00AM Woah 30min

11:30AM Sit Down and Write 30min

12:00PM Lunch

01:00PM Accounting-Driven Development 45min

01:45PM Clojure Ate Scala (on my project) 45min

02:30PM A World Without HackerNews 30min

03:00PM Ruby on Rails Legacy App Maintenance 60min

04:00PM Rails for Python Developers lightning

05:00PM Networking Event


# Conference Track Management Solutions 

There could be various ways to design the solution of this problem. One of the possible approach as used in bin packing problem.In the bin packing problem, "objects of different volumes must be packed into a finite number of bins or containers each of volume V in a way that minimizes the number of bins used". Lets have a real example of this: Suppose you have to pack items based on the baggage allowance permitted by the international/national airlines. It’s like you are allowed to have four bags A,B,C,D with a max capacity of each bag is 40 KG. You have N items to pack, those N items are with different size and shapes. Lets say you have one item with weight 1 KG and another Item with a weight of 5 KG and so on. You need to devise a strategy so that optimal steps could be performed to fill the bags under the permitted limits or reduce the number of bags.

This following solution uses a heuristic approach to provide one approximate solution:

Step-1: Calculate No. Of Tracks Needed
It extracts the following input from the given input information:
It calculates the total no. of minutes available for talk on each track (180 minutes for morning session and 240 minutes for afternoon session).
Total no. of minutes of talks needed to be schedule on these tracks. 
It calculates that how many morning and afternoon session required.
Based on the above it calculates the no. of tracks.

Step-2: Sort All The Talks in Decending Order 
It sorts all the talks in descending ordered based on the given talks timings. 

Step-3: Schedule In A Track
It picks talk one by one and schedule in a track and put into the Morning session or afternoon session without caring the left empty minutes in morning or afternoon session.

Step-4: Pics All The Talks Which Are Now With The Assoicated Track No
It picks all the talks which are now with the associated track no. , its scheduled time and other relevant information. It processes that information and output as a solution. 

Step-5: Add Rules To Re-evaluate The Schedule Of Talks Into Tracks
TBD  Add rules to re-evaluate the Schedule of Talks into Tracks e.g. If on evaluation its found that on Track-1 have 30 free minutes and on Track-2 have 45 free minutes, and one talk of 60 minutes need to schedule. It can shuffle 30 mins talks (if possible) from Track-1 to Track-2 , and accommodate this 60 mins talk to track-1,only varieties of input will provide right sense and this solution will improve.


The above solution designed based on the given talks input set and various other parameters (e.g. missing information). Initially it design the appropriate conference schedule based on the given talks input, and continuously add the rules based on the received further inputs. It checks the received input patterns and optimizes the solution.

This solution required improvement (not limited to) 

e.g. 
•	Adding the proper log information.


•	Adding the appropriate exceptions, error handling, 


•	Reorganize all code into appropriate code folders.


•	Create a pom.xml file so that it could be compile and run via maven. 


•	If missing information available then add those constraints as well.


•	Currently it depicts one solution where it has exercised only one test-input it required to test various other talks input values.


•	Various cosmetic things e.g. add/remove comments, add/remove variables/methods



# Missing information: 

It missing some information which could be helpful to design the solution better e.g. 

•	The given information doesn’t talk about the maximum talk limit or minimum talk limits.

•	It talks about the multiple tracks, but doesn’t tell about the definition or restriction of multiple tracks e.g. if one track only uses 5 minutes talks only because previous tracks got filled out.

•	Definition of the previous verification done on talks e.g. whether number of talks almost filling the tracking schedule or its going beyond it. 

•	It doesn’t talk about the order restriction, is there any talks which are required to maintain the order if any or any priority.

•	It doesn’t tell if any talks may come on runtime.

and many others 


# Steps to compile and run this solution
Development Environment Used  : 
OS-X Yosemite 10.10.1 ,IntelliJ Idea 14.1.1 community addition, JDK 1.8.0_45


1.	Install latest IntelliJ community edition e.g. 14.1.1.
2.	Import the conference-track-management project into IntelliJ
3.	On the IntelliJ Menu click on Run.


•	Test Input :

•	Writing Fast Tests Against Enterprise Rails 60min

•	Overdoing it in Python 45min

•	Lua for the Masses 30min

•	Ruby Errors from Mismatched Gem Versions 45min

•	Common Ruby Errors 45min

•	Rails for Python Developers lightning

•	Communicating Over Distance 60min

•	Accounting-Driven Development 45min

•	Woah 30min

•	Sit Down and Write 30min

•	Pair Programming vs Noise 45min

•	Rails Magic 60min

•	Ruby on Rails: Why We Should Move On 60min

•	Clojure Ate Scala (on my project) 45min

•	Programming in the Boondocks of Seattle 30min

•	Ruby vs. Clojure for Back-End Development 30min

•	Ruby on Rails Legacy App Maintenance 60min

•	A World Without HackerNews 30min

•	User Interface CSS in Rails Apps 30min


•	Test Output :


•	Track 1:


•	09:00 AM Ruby on Rails Legacy App Maintenance 60min

•	10:00 AM Ruby on Rails: Why We Should Move On 60min

•	11:00 AM Rails Magic 60min

•	12:00 PM Lunch

•	13:00 PM Communicating Over Distance 60min

•	14:00 PM Writing Fast Tests Against Enterprise Rails 60min

•	15:00 PM Clojure Ate Scala (on my project) 45min

•	15:45 PM Pair Programming vs Noise 45min

•	5:00 PM Networking Event



•	Track 2:


•	09:00 AM Accounting-Driven Development 45min

•	09:45 AM Common Ruby Errors 45min

•	10:30 AM Ruby Errors from Mismatched Gem Versions 45min

•	11:15 AM Overdoing it in Python 45min

•	12:00 PM Lunch

•	13:00 PM User Interface CSS in Rails Apps 30min

•	13:30 PM A World Without HackerNews 30min

•	14:00 PM Ruby vs. Clojure for Back-End Development 30min

•	14:30 PM Programming in the Boondocks of Seattle 30min

•	15:00 PM Sit Down and Write 30min

•	15:30 PM Woah 30min

•	16:00 PM Lua for the Masses 30min

•	16:30 PM Rails for Python Developers 5min

•	5:00 PM Networking Event




•	Process finished with exit code 0



