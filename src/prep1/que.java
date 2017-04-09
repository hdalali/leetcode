package prep1;

public class que {
	public int size;
	public int[] arr;
	public int etop=-1;
	public int dtop=0;
	public int pdtop;
	public int ecnt=0;
	public int dcnt=0;
	public int lec=0;
	public int ldc=0;
	
public static void que_main(){
	que pq=new que(5);
	pq.enque(10);
	pq.enque(20);
	pq.deque();
	pq.enque(30);
	pq.enque(40);
	pq.deque();
	pq.enque(50);
	pq.enque(60);
	pq.enque(70);
	pq.enque(80);
	pq.deque();
	
	//pq.enque(80);
	//pq.enque(90);
	
}

public que(int x){
	size=x;
	arr = new int[size];
}

public void enque(int p){
	ecnt++;
	etop++;
	if(etop==size){
		etop=0;
	}
	if((ecnt-dcnt)>size){
		System.out.println("Sorry Queque is full");
		--ecnt;
		return;
	}
	
	arr[etop]=p;
	
	System.out.printf("Your element %d has been pushed to queue\n",p);
	System.out.println("The current queque status is");
	lec=(ecnt-dcnt);
	int temp1=dtop;
	
	while(lec != 0){
		System.out.printf("%d\t",arr[temp1]);
		temp1++;
		if(temp1==size){
			temp1=0;
		}
		lec--;
		
	}
	
	//for(int i=dtop;i<=etop;i++){
		//System.out.printf("%d\t",arr[i]);
	//}
	
	System.out.println("\n");
}

public int deque(){
	dcnt++;
	if((ecnt-dcnt)<0){
		System.out.println("Sorry Queque is empty\n");
		--dcnt;
		return 0;
	}
	
	
	System.out.printf("Your element %d has been dequeued\n",arr[dtop]);
	
	dtop++;
	if(dtop==size){
		dtop=0;
	}
	
	System.out.println("The current queque status is");
	ldc=(ecnt-dcnt);
	int temp2=dtop;
	
	while(ldc != 0){
		System.out.printf("%d\t",arr[temp2]);
		temp2++;
		if(temp2==size){
			temp2=0;
		}
		ldc--;
		
	}
	
	//for(int i=(dtop);i<=etop;i++){
		//System.out.printf("%d\t",arr[i]);
	//}
	System.out.println("\n");
	return(arr[dtop]);
	
}

}
