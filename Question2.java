class Question2
{
    public static void search(int arr[],int first, int last, int key)
    {
        int mid=(first +last)/2;
        while(first<=last)
        {
            if(arr[mid]<key)
            {
                first=mid+1;
            }
            else if(arr[mid]==key)
            {
                System.out.println("Element found at "+mid);
                break;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last)
        {
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int key=20;
        int len=arr.length-1
        System.out.println(key+" Key Found at position "+search(arr,0,len,key));
    }
}