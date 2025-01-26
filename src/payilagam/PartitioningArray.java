package payilagam;

public class PartitioningArray {
	public static void main(String[] args) {
	int[] ages = {42,11,19,22,12};
	int key = 18;
	int i = 0;
	int j = 0;
	while(i<ages.length)
	{
		if(ages[i] < key) {
			int temp = ages[i];
			ages[i] = ages[j];
			ages[j] = temp;
			j++;
		}
		i++;
	}
	for(i = 0; i<ages.length; i++) {
		System.out.print(ages[i]+" ");
	}
}
}

