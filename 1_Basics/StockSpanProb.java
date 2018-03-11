import java.util.Stack;

public class Solution {

	public static int[] stockSpan(int[] price) {
        //S<=output array
        int S[]=new int[price.length];
         
        // Create a stack to push/pop index which helps in keeping track 
        Stack<Integer> st= new Stack<Integer>();
        //and push index of first element to it
        st.push(0); 
         
        // Span value of first element is always 1
        S[0] = 1;
         
        // Calculate span values for rest of the elements
        for (int i = 1; i < price.length; i++)
        {
            // Pop elements from stack while stack is not empty and top of
            // stack is smaller than price[i]
            while (!st.isEmpty() && price[st.peek()] < price[i])
                st.pop();
            //NOTE:- price[st.peek()] <= price[i] gives error
            // in case price[] = {1, 1, 1, 1, 1};
            
            // If stack becomes empty, then price[i] is greater than all elements
            // on left of it, i.e., price[0], price[1],..price[i-1].
            //Else price[i] is greater than elements after top of stack
            S[i] = (st.isEmpty())? (i + 1) : (i - st.peek());
            //i - st.peek():- because st.peek() contains the index of last biggest num
     
            // Push index of this element to stack
            st.push(i);
        }
          return S;


	}
}