/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-05-11
 * Time: 10:44
 */
public class binarySearch {
    public static boolean binarySearch(int []array,int x,int n)
    {   int left=0;
        int right=n-1;
        int i=0;
        int j=0;
        while(left<=right)
        { int middle=(left+right)/2;
            if(x==array[middle])
            {i=j=middle;
            return true;
            }
            if(x>array[middle])
            { left=middle+1;}
            else { right=middle-1;
            }
        }
        i=right;
        j=left;
        return false ;
    }
}
