
import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.abs;

public final class ListOperator {
    public final List<Integer> getSum(List<Integer> firstList, List<Integer> secondList)
    {
        List<Integer> outList;
        int remainder =0;
        int newRemainder ;
        int dif=abs(firstList.size()-secondList.size());
        //If the first list is longer
        if(firstList.size()>secondList.size()){
            outList=firstList;

            for(int i= outList.size()-1;i>=0;i--)
            {
                if(i-dif>=0)
                {
                    newRemainder=(outList.get(i)+secondList.get(i-dif)+remainder)/10;
                    outList.set(i,(outList.get(i) +secondList.get(i-dif)+remainder)%10);
                    remainder= newRemainder;
                }
                else
                {
                    newRemainder=(outList.get(i)+remainder)/10;
                    outList.set(i,(outList.get(i) +remainder)%10);
                    remainder=newRemainder;
                }
            }
        }
        //If the second list is longer or equal to the first
        else{
            outList=secondList;
            for(int i= outList.size()-1;i>=0;i--)
            {
                if(i-dif>=0)
                {
                    newRemainder=(outList.get(i)+firstList.get(i-dif)+remainder)/10;
                    outList.set(i,(outList.get(i) +firstList.get(i-dif)+remainder)%10);
                    remainder= newRemainder;
                }
                else
                {
                    newRemainder=(outList.get(i)+remainder)/10;
                    outList.set(i,(outList.get(i) +remainder)%10);
                    remainder=newRemainder;
                }
            }
        }
        //If the return value List is longer than the originals
        if(remainder!=0){
            List<Integer> longerOutList= new ArrayList<>(outList);
            longerOutList.add(0,remainder);
            return longerOutList;
        }
        return outList;
    }
}
