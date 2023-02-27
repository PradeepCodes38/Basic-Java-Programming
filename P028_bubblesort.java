
public class P028_bubblesort {
  public static void main(String[] args) {
    //bubble sort
    int arr[]={7,1,3,2,5};
for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-i-1;j++){
if(arr[j]>arr[j+1]){
    //swap
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]= temp;
    

}
    }



}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
  }  
}

