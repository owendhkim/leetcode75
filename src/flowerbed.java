class flowerbed
{
    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        if(n == 0)
        {
            return false;
        }
        if(flowerbed.length == 1)
        {
            if(flowerbed[0] == 0 && n > 0)
            {
                flowerbed[0] = 1;
                n--;
            }
        }
        else if(flowerbed.length == 2)
        {
            if(flowerbed[0] == 0 && flowerbed[1] == 0 && n > 0)
            {
                flowerbed[0] = 1;
                n--;
            }
        }
        else
        {
            for(int i = 0; i < flowerbed.length && n > 0; i++)
            {
                if(i == 0)
                {
                    if(flowerbed[i] == 0 && flowerbed[i+1] == 0)
                    {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                else if(i == flowerbed.length-1)
                {
                    if(flowerbed[i] == 0 && flowerbed[i-1] == 0)
                    {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
                else
                {
                    if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0)
                    {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }
        return n == 0;
    }

    public static void main(String[] args)
    {
        flowerbed f = new flowerbed();
        int[] arr = {0};
        System.out.println(f.canPlaceFlowers(arr, 1));
        System.out.println(f.canPlaceFlowers(arr, 2));
    }
}