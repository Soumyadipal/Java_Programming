import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Q.1) Fractional Knapsack
 //Given the weights and profits of N items, in the form of {profit, weight} put these items in a knapsack of
 //capacity W to get the maximum total profit in the knapsack. In fractional Knapsack, we can break items for
 //maximizing the total value of the knapsack.
 //Input : arr[] = {{60, 10}, {100, 20}, {120, 30}}, W = 50
 //Output : 240
 //Explanation: By taking items of eight 10 and 20 kg and 2/3 fraction of 30 kg.
 // Hence, total price will be 60+100+(2/3)(120) = 240

 // Q.2) Maximum meetings in one room
 //There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where S[i] is the start time of
 //meeting i and F[i] is the finish time of meeting i. The task is to find the maximum number of meetings that can
 //be accommodated in the meeting room. Print all meeting numbers.
 //Constraints:
 //0 <= S[i], F[i] < 24
 // Input :
 //S[] = {1, 3, 0, 5, 8, 5}
 //F[] = {2, 4, 6, 7, 9, 9}
 // Output : 1 2 4 5


 // Q.3) Check if it is possible to survive on Island
 //You are a person in an island.There is only one shop in this island, this shop is open on all days of the week
 //except for Sunday. Consider following constraints
 //S – Number of days you are required to survive.
 //N – Maximum unit of food you can buy each day.
 //M – Unit of food required each day to survive.
 //Currently, it’s Monday, and you need to survive for the next S days.
 //Find the minimum number of days on which you need to buy food from the shop so that you can survive the
 //next S days, or determine that it isn’t possible to survive.
 // Input :
 //S = 10 N = 16 M = 7
 // Output :
 //Yes
 //Minimum days to buy food : 2
 //Explanation: One possible solution is to buy a box on the first day (Monday), it’s sufficient to eat from this box up
 //to 8th day (Monday) inclusive. Now, on the 9th day (Tuesday), you buy another box and use the food in it to
 //survive the 9th and 10th day.
 // Input : 10 70 30
 // Output : No
 //Explanation: You can’t survive even if you buy food because the maximum number of units you can buy in one
 //day is less than the required food for one day.
public class BasicProblems1 {

    public static class Item {  // Q.1
        int value;              // Q.1
        int weight;             // Q.1
        public String toString(){  // Q.1
            return value + " " + weight;  // Q.1
        }                           // Q.1
    }                               // Q.1

    public static class ItemComparator implements Comparator<Item> {               // Q.1
        public int compare(Item i1,Item i2){                                       // Q.1
            if((i1.value / i1.weight) < (i2.value / i2.weight)) return 1;          // Q.1
            else if ((i1.value / i1.weight) > (i2.value / i2.weight)) return -1;   // Q.1
            else return 0;                                                         // Q.1
        }                                                                          // Q.1
    }                                                                              // Q.1


     public static class Meeting {  // Q.2
         int startTime;              // Q.2
         int finishTime;             // Q.2
         int meetingNumber;          // Q.2
         public String toString(){  // Q.2
             return startTime + " " + finishTime;  // Q.2
         }                           // Q.2
     }                               // Q.2

     public static class MeetingComparator implements Comparator<Meeting>{  // Q.2
        public int compare(Meeting m1,Meeting m2){                          // Q.2
            if(m1.finishTime > m2.finishTime) return 1;                     // Q.2
            else if (m1.finishTime > m2.finishTime) return -1;              // Q.2
            else return 0;                                                  // Q.2
        }                                                                   // Q.2
     }                                                                      // Q.2
     public static void main(String[] args) {
//         List<Integer> value = List.of(60,100,120);   // Q.1
//         List<Integer> weights = List.of(10,20,30);   // Q.1
//         List<Item> itemList = new ArrayList<>();     // Q.1
//         for (int i = 0;i < value.size();i++){        // Q.1
//             Item item = new Item();                  // Q.1
//             item.value = value.get(i);               // Q.1
//             item.weight = weights.get(i);            // Q.1
//             //System.out.println(item);              // Q.1
//             itemList.add(item);                      // Q.1
//         }                                            // Q.1
//         itemList.sort(new ItemComparator());         // Q.1
//         System.out.println(itemList);                // Q.1
//         int W = 50;                                  // Q.1
//         int profit = 0;                              // Q.1
//         while (W > 0){                               // Q.1
//             for(int i = 0;i < itemList.size() && W > 0;i++){   // Q.1
//                 Item item = itemList.get(i);                   // Q.1
//                 if (item.weight <= W){                         // Q.1
//                     profit += item.value;                      // Q.1
//                     W -= item.weight;                          // Q.1
//                 }                                              // Q.1
//                 else {                                         // Q.1
//                     profit += item.value / item.weight * W;    // Q.1
//                     W = 0;                                     // Q.1
//                 }                                              // Q.1
//             }                                                  // Q.1
//         }                                                      // Q.1
//         System.out.println("Profit : " + profit  ); // T.C.-> O(nlogn) S.C -> O(n)  // Q.1



//         List<Integer> start = List.of(1,3,0,5,8,5);   // Q.2
//         List<Integer> finish = List.of(2,4,6,7,9,9);   // Q.2
//         List<Meeting> meetings = new ArrayList<>();    // Q.2
//         for (int i = 0;i < start.size();i++){        // Q.2
//             Meeting meeting = new Meeting();         // Q.2
//             meeting.startTime = start.get(i);        // Q.2
//             meeting.finishTime = finish.get(i);      // Q.2
//             meeting.meetingNumber = i + 1;           // Q.2
//             meetings.add(meeting);                   // Q.2
//         }                                            // Q.2
//         meetings.sort(new MeetingComparator());      // Q.2
//         List<Integer> result = new ArrayList<>();    // Q.2
//         result.add(meetings.get(0).meetingNumber);   // Q.2
//         Meeting previousMeeting = meetings.get(0);   // Q.2
//         for (int i = 1;i < meetings.size();i++){     // Q.2
//             Meeting currentMeeting = meetings.get(i); // Q.2
//             if (currentMeeting.startTime > previousMeeting.finishTime){  // Q.2
//                 result.add(currentMeeting.meetingNumber);  // Q.2
//                 previousMeeting = currentMeeting;  // Q.2
//             }                                      // Q.2
//         }                                          // Q.2
//         System.out.println(meetings);              // Q.2
//         System.out.println(result);  // T.C.-> O(nlogn) S.C -> O(n)  // Q.2


         int S = 10;                        // Q.3
         int N = 16;                        // Q.3
         int M = 2;                         // Q.3
         int total_food_required = S * M;   // Q.3
         int result;                        // Q.3
         if((M > N) || (7 * M) >(6 * N)){   // Q.3
             result = -1;                   // Q.3
         }                                  // Q.3
         else {                             // Q.3
             result = (int)Math.ceil((double) total_food_required / N);  // Q.3
         }                                  // Q.3
         System.out.println(result);        // Q.3
     }
}
