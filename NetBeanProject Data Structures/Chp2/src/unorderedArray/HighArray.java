package unorderedArray;
public class HighArray {
    long [] a; //ref to array a
    int nElems; //number of data limits

    public HighArray(int max)/*constructor*/{
        a = new long [max];
        nElems=0;
    }
    public void insert(long value)/*put element into array*/{
        a[nElems] = value;//insert it
        nElems++;//increment size
    }
    public String find(long searchKey)/*find specific value*/{
        int j;
        String Word = null;
        for(j=0;j<nElems;j++){
            if(a[j] == searchKey){
                Word = "Found "+searchKey;
            }else{
                Word = "Can't find " + searchKey;
            }
        }
        return Word;
    }
    public boolean delete(long value){
        int j;
        for(j=0;j<nElems;j++){ /*look for it*/
            if(value == a[j]){
                break;
            }
        }
        if(j==nElems){ /*cant find it*/
            return false;
        }else{ /*found it*/
            for(int k=j;k<nElems;k++){ //move higher ones down
                a[k]=a[k+1];
            }
            nElems--; //decrement size
            return true;
        }
    }//end delete()
    public void display(){/*display array contents*/
        for(int j=0;j<nElems;j++){ /**for each element*/
            System.out.println(a[j]); /**display it*/
        }
        System.out.println("");
    }
}

