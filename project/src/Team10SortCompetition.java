public class Team10SortCompetition extends SortCompetition{

	@Override
	public int challengeOne(int[] arr) {
		 quickSort(arr, 0, arr.length-1); 
         return getMedian(arr);
	}

	@Override
	public int challengeTwo(String[] arr, String query) {
		bubbleSort(arr); 
		
        for (int i = 0; i < arr.length; i++){
        if (arr[i].equals(query)){
           return i;	
        }
        }
        return -1; 
	}

	@Override
	public int challengeThree(int[] arr) {
		 insertionSort(arr);
	     return getMedian(arr); 
	}

	@Override
	public int challengeFour(int[][] arr) {
		{
			int [] sorted = new int [arr.length];
			
			for(int i = 0; i < arr.length; i++) 
			{
				quickSort(arr[i],0,arr.length-1);
				sorted [i] = getMedian(arr[i]);
			}
			
			quickSort(sorted,0,sorted.length-1);
			return getMedian(sorted);
			}
		}
	@Override
	public int challengeFive(Comparable[] arr, Comparable query) {
		insertionSort2(arr); 
		
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		
		while (low <= high && arr[mid] != query)
				{
			
			if (arr[mid].compareTo(query) == 0)
				{
					return mid;
				}

			else if (arr[mid].compareTo(query) < 0)
				{
					low = mid + 1;
				}
			else
				{
					high = mid - 1;
				}
					mid =(low + high) /2;

			if (low > high)
			mid = -1;
				}
			return mid;
		}

	@Override
	public String greeting() {
		 return "It's everyday bro";
    }
			
	
	// Additional Helper Methods 
		
		    public static void insertionSort(int[]arr)
		    {
		        for(int i = 2; i < arr.length; i++)
		        {
		            int j = i;
		            while((j> 1) && (arr[j-1] > arr[j]))
		            {
		            swapInt(arr,j,j-1);
		            j= j-1;
		            }
		        }
		    }
		
		    public static void swapInt ( int[]arr, int mama, int mio )
		    {
		        int store = arr[mama];
		        arr[mama]= arr[mio];
		        store = arr[mio];
		        }
		
		    public static int getMedian(int[] arr)
		    {
		        int mid = 0;
		        if (arr.length % 2 == 0){
		             mid = (int)(arr[arr.length/2] + arr[(arr.length/2) - 1])/2;}
		        else { 	
		            mid = (int)arr[arr.length/2-1];
		             }
		        return mid;
		    }
		    
			public static void quickSort(int[] list1, int front, int back){
				if (front < back)
				{
					 int pivotPosition = partition(list1, front, back);
					 quickSort(list1,front,pivotPosition-1);
					 quickSort(list1,pivotPosition+1,back);
				}
			}
					   
			public static int partition(int[] list1, int front, int back){
				int pivot = list1[front];
				int pivotPosition = front;
				for (int i = front+1; i <= back; i++){
					if (list1[i]<=pivot){
						for (int j = 0; j<i-pivotPosition; j++)
						{
							swap(list1,i-j,i-j-1);
						}
						pivotPosition++;
					}
				}
			return pivotPosition;
			}
			
			
			public static void bubbleSort(String[] list1){
			for(int i = 0; i<list1.length-1; i++){
				if(list1[i+1].compareTo(list1[i]) <= 0){
					swapString(list1,i,i+1);
					bubbleSort(list1);
					}
				}
			}
			
			
			public static void swapString(String[] arr, int i, int j) {
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			public static void insertionSort2(Comparable[] a) {
	
			        for (int i=0;  i != a.length;  i = i+1) {
				           Comparable itemToInsert = a[i];
				           int j = i;
				           while (j != 0  &&  greaterThan(a[j-1], itemToInsert)) {
				        	   a[j] = a[j-1];  j = j-1;
			           }
			           a[j] = itemToInsert;
			        }
			     }
	
			private static boolean greaterThan(Comparable left, Object right) {
			         
					return left.compareTo(right) == 1; 
			}
			  
			public static void swap(int[] arr, int i, int j)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}		
	}
