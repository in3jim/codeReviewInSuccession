import java.util.*;

public class codeReviewSort {
	public static void main(String[] args){
		String[] peosonName = {"shirley","jerry","siang","mosehas","jodi","hana"};
		int peosonCount = peosonName.length % 2 == 0 ? peosonName.length + 1 : peosonName.length;
		int dataLength = peosonCount-1;
		String[] sortArr = new String[dataLength];
		int sortArrIndex = 0;
		String sort = "" + dataLength;
		int preNumber = dataLength;
		while(sortArrIndex < sortArr.length){
		  for(int i = 1; i < peosonCount; i++){
	
		    int sortNumber = preNumber-(sortArrIndex + 1);
		    preNumber = sortNumber;
		    
		    if(preNumber < 0) {
		      preNumber += peosonCount;
		      sortNumber += peosonCount;
		    }
		    
		    sort += sortNumber;
		    
		    if(i == sortArr.length){
		      sortArr[sortArrIndex] = sort;
		      sort = "" + sortArr.length;
		      preNumber = dataLength;
		      sortArrIndex++;
		    }
		    
		  }
		}
		
		int j = peosonCount == peosonName.length ? 0 : 1;
		for(int i = 0;i < sortArr.length; i++){
		  String sortData = sortArr[i];
		  while(j < sortData.length()){
		    System.out.print(" -> ");
		    int index = sortData.charAt(j);
		    System.out.print(peosonName[index-48]);
		    j++;
		  }
		  j = peosonCount == peosonName.length ? 0 : 1;
		  System.out.println();
		}
		
	}
}