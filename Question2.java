class Question2
{
    public static int search(int arr[], int key)
    {
        for(int i=0; i<=arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,40,20,30,50};
        int key=20;
        System.out.println(key+" Key Found at position "+search(arr,key));
    }
}