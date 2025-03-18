import java.util.Arrays;

public class pairs_of_spells_and_potions
{
    public int[] successfulPairs(int[] spells, int[] potions, long success)
    {
        Arrays.sort(potions);
        int[] result = new int[spells.length];
        for(int i = 0; i < spells.length; i++)
        {
            long minPotionVal = (success + spells[i] - 1) / spells[i];
            int startingPoint = findStartingPoint(potions, minPotionVal);
            result[i] = potions.length - startingPoint;
        }
        return result;
    }

    public int findStartingPoint(int[] potions, long target)
    {
        int left = 0;
        int right = potions.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (potions[mid] > target) {
                right = mid;  // Move right pointer to mid since mid is too large
            } else {
                left = mid + 1;  // Move left pointer past mid since mid is ≤ target
            }
        }
        return left;
    }
}
