
public class test {

	public static void main(String[] args) {
		SequenceSet s = SequenceSet.load("sample.fasta");
		LinkedList<Sequence> list = s.seqList ;
		list.findFirst();
//		while(!list.last()){
//			System.out.println(list.retrieve().getHeader());
//			System.out.println(list.retrieve().getSeq()); 
//			list.findNext();
//		}
//		System.out.println(list.retrieve().getHeader());
//		System.out.println(list.retrieve().getSeq());
		
//00000
	
	list.findFirst();
	list.findNext();
	
	
	Sequence kkk = list.retrieve();
	LinkedList<Pair<String, Integer>> kList = kkk.getUsage(4,1).pList;
	kList.findFirst();
	while(!kList.last()){
		System.out.println(kList.retrieve().first + " " + kList.retrieve().second);
		kList.findNext();
	}
	System.out.println(kList.retrieve().first + " " + kList.retrieve().second);
	}

}
