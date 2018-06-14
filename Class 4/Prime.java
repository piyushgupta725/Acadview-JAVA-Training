import java.util.Scanner;
class Prime{
public static void main(String[] args){ 
    Scanner sc  = new Scanner(System.in);
	System.out.println("enter the no");
	int n = sc.nextInt();
  
	int i;
	for( i=2;i<=n;i++){
			int flag=0;
		for(int j=2;j<i;j++){
			if(i%j==0){
		flag=1;break;
		}
		
		}
		
	if(flag==0)
	System.out.println("prime"+i);

		
	}
	
	
}
}
