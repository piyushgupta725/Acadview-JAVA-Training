class Ascending{
public static void main	(String[] args){
	int temp,i,j;
	int arr[]={1,1,1,1,0,0,1,0};
	for( j=0;j<(arr.length-1);j++){
	for( i=0;i<arr.length-1;i++){
	if	(arr[i]>arr[i+1]){
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
	}
	}for(i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}		
	}
		
}