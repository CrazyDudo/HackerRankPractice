import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EulerFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =(int)EulerGenerate(n);//由于double运算的精度很高（64位存储），所以误差很小，导致小数部分很小，可以直接舍弃小数部分
		System.out.println(temp);
	}

	private static double EulerGenerate(int n) {
		if(n==1) {
			return 1.0;
		}
		int eNum = -1;
		String[] dc = Discompose(n).split(" ");
		Map<Integer,Integer> map=new HashMap<>();//键表示素因数，值表示该素因数的次方数
		for (String child : dc) {
			int num=Integer.parseInt(child);//将每个素因数转化为整型（Discompose方法返回格式固定，略去异常处理）
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);//把次方数加1
			}else {
				map.put(num, 1);
			}
		}
		//System.out.println(map);
		Set<Integer> set = map.keySet();
		double temp=1.0;
		for (Integer p : set) {
			temp=temp*(1-(1.0/p));//直接使用double代替分数近似运算，在主函数中采用舍弃法处理误差
		}
		temp*=n;
		return temp;
	}
	//对n进行素因式分解
	private static String Discompose(int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sb.append(i + " ");
				n = n/i;
				i--;
			}

		}
		sb.append(n+" ");
		return sb.toString();
	}
}
 