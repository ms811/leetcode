public class koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1;
        for (int pile : piles) {
            end = Math.max(end, pile);
        }
        //end = Arrays.stream(piles).max().getAsInt();
        int res = end;
        int middle;
        while (start <= end) {
            middle = start + (end - start)/2;
            int hours = 0;
            for (int pile : piles) {
                hours += Math.ceil(pile/middle);
            }

            if (hours <= h) {
                res = Math.min(res, middle);
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }

        return res;
    }
}
