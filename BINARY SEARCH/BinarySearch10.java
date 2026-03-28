public class BinarySearch10 {
public static void main(String[] args) {
int arr[]={1,1,2,2,3,3,4,5,5,6,6};
int i=0,j=arr.length-1;
int ans=0;
while(i<=j){
int mid=i+(j-i)/2;
int f=mid;
int s=mid;
if(arr[mid]==arr[mid+1]){
s=mid+1;
}
else if (arr[mid]==arr[mid-1]){
f=mid-1;
}
else{
ans=arr[mid];
}
int leftcount=s-i+1;
int rigthcount=j-s;
if(leftcount%2==0) i=s+1;
else j=f-1;
}
System.out.println(ans);

}
}

    

