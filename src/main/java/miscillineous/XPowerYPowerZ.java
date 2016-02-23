package miscillineous;

public class XPowerYPowerZ {
	public static void main(String[] args) {
		int val = power(2, 3, 2);
        System.out.println(val);
        val = power(2, 3);
        System.out.println(val);
	}

	static int power(int x, int y, int z)
    {
        return power(power(x, y), z);
    }

    static int power(int x, int y)
    {
        if (y == 0)
        {
            return 1;
        }
        if (y == 1)
        {
            return x;
        }
        return x * power(x, y - 1);
    }
}
