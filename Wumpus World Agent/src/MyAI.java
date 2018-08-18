// ======================================================================
// FILE:        MyAI.java
//
// AUTHOR:      Abdullah Younis
//
// DESCRIPTION: This file contains your agent class, which you will
//              implement. You are responsible for implementing the
//              'getAction' function and any helper methods you feel you
//              need.
//
// NOTES:       - If you are having trouble understanding how the shell
//                works, look at the other parts of the code, as well as
//                the documentation.
//
//              - You are only allowed to make changes to this portion of
//                the code. Any changes to other portions of the code will
//                be lost when the tournament runs your code.
// ======================================================================
import java.util.*;
public class MyAI extends Agent
{
	Stack<Action> s = new <Action> Stack();
	int flag=0, gold_flag =0,up_flag=0,turned_right=0;
	public MyAI ( )
	{
		
		
		// ======================================================================
		// YOUR CODE BEGINS
		// ======================================================================
		
		// ======================================================================
		// YOUR CODE ENDS
		// ======================================================================
	}
	
	public Action getAction
	(
		boolean stench,
		boolean breeze,
		boolean glitter,
		boolean bump,
		boolean scream
	)
	{
		//World w = new World();
		
		//System.out.println("IA x: ");
		if(stench) System.out.println("Stench");
		if(breeze) System.out.println("Breeze");
		if(glitter) System.out.println("Glitter");
		if(bump) System.out.println("Bump");
		if(scream)System.out.println("Scream");
		
		//System.out.println("Flag "  + flag+" UPFlag: "  + up_flag + " turnedRightFLag " + Turnedright_flag);
		
	
		if(s.empty() && (breeze || stench) )
			{ System.out.println("Action taken: "+ Action.CLIMB);
			return Action.CLIMB;
			}
	
		//if(!s.isEmpty())System.out.println(s.peek());
		
		if(up_flag ==1 && s.empty()) 
		{
			System.out.println("Action taken: " + Action.CLIMB);
			return Action.CLIMB;
		}
		
		if(!bump && !breeze && !stench && !glitter && flag ==0 )
		{
			if(turned_right == 1) up_flag =1;
			
			System.out.println("Action taken: " + Action.FORWARD);
			s.push(Action.FORWARD);
			return Action.FORWARD;

		}
		if(glitter && flag ==0 )
		{
	
			System.out.println("Action taken: " + Action.GRAB);
			s.push(Action.TURN_LEFT);
			s.push(Action.TURN_LEFT);
			flag =1;gold_flag=1;
			return Action.GRAB;
		
		}
		if(bump && flag ==0)
		{
			System.out.println("Action taken: " + Action.TURN_LEFT);
			s.push(Action.TURN_LEFT);
			flag =1;
			return Action.TURN_LEFT;
		}
		
		if(breeze && flag ==0)
		{
			System.out.println("Action taken: " + Action.TURN_LEFT);
			s.push(Action.TURN_LEFT);
			flag =1;
			return Action.TURN_LEFT;
		}
		if(stench && flag ==0)
		{
			System.out.println("Action taken: " + Action.TURN_LEFT);
			s.push(Action.TURN_LEFT);
			flag =1;
			return Action.TURN_LEFT;
		}
		
		if(s.isEmpty()) 
		{
			flag =0;
			
			if(gold_flag ==1)
			{
			System.out.println(Action.CLIMB);
			return Action.CLIMB;
			}
			
			else 
			{
				turned_right=1;
				System.out.println("Action taken: " + Action.TURN_RIGHT);
				return Action.TURN_RIGHT;
			}
		}
		//System.out.println(s.capacity());
		
		if(flag == 1) 
		{
			System.out.println("Action taken: " + s.peek());
			return s.pop();
		}
		
		
		

			/*while(s.isEmpty())
			{
				return s.pop(); 
			}*/
		
		// ======================================================================
		// YOUR CODE BEGINS
		// ======================================================================
		
		return Action.CLIMB;
		// ======================================================================
		// YOUR CODE ENDS
		// ======================================================================
	}
	
	// ======================================================================
	// YOUR CODE BEGINS
	// ======================================================================


	// ======================================================================
	// YOUR CODE ENDS
	// ======================================================================
}