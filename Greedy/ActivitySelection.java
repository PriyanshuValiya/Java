import java.util.*;

public class ActivitySelection {
    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // If activites were not sorted according to end time
        int activity[][] = new int[start.length][3];

        for(int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        // Lambda function
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activity[0][0]);
        int prevEnd = activity[0][2];

        for(int i=1; i < end.length; i++) {
            if(activity[i][1] >= prevEnd) {
                // activity select
                maxAct++;
                ans.add(i);
                prevEnd = end[i];
            }
        }

        System.out.println("Total Tasks : " + ans.size());

        for(int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}