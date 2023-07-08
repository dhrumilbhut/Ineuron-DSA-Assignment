
//  **Question 7**

// Given a sequence of n strings, the task is to check if any two similar words come together and then destroy each other then print the number of words left in the sequence after this pairwise destruction.


import java.util.Stack;
import java.util.Vector;

public class Question7 {
    static int removeConsSame(Vector <String > s){ 
        Stack<String> st = new Stack<>(); 
       
        for(int i=0; i<s.size(); i++){ 
            if(st.empty()){ 
                st.push(s.get(i));
            }
            
            else{ 
                String str = st.peek(); 
       
                if(str.equals(s.get(i))){     
                    st.pop(); 
                }
       
                else{
                    st.push(s.get(i));
                }
            } 
        } 
        return st.size(); 
    } 
      
    public static void main(String[] args){ 
        Vector<String> s = new Vector<>(); 
  
        s.addElement("ab"); 
        s.addElement("aa"); 
        s.addElement("aa");
        s.addElement("bcd");
        s.addElement("ab");
  
        System.out.println(removeConsSame(s)); 
    } 
}
