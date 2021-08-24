package friends;
import java.util.ArrayList;
import structures.Queue;
import structures.Stack;
//SANDIPAN MONDAL
public class Friends {
	public static ArrayList<String> shortestChain(Graph g, String p1, String p2) {
		
		if(!g.map.containsKey(p1) || !g.map.containsKey(p2))
			return null;

		ArrayList<String> pathHolder = new ArrayList<String>();
		boolean[] didPass = new boolean[g.members.length];
		int[] edge = new int[didPass.length];
		int[] anotherHolder = new int[edge.length];
		
		for(int x= 0; x <edge.length; x++)
		{
			anotherHolder[x] = x;
			anotherHolder[x] = -495;
		}

		Queue<Person> qHolder = new Queue<Person>();
		qHolder.enqueue(g.members[g.map.get(p1)]);
		edge[g.map.get(p1)] = 0;
		
		for(int x = 0; x <didPass.length; x++)
		{
			edge[x] = -1234;
			didPass[x] = false;
		}

		didPass[g.map.get(p1)] = true;
		boolean checker = false;

		while(!qHolder.isEmpty())
		{
			Person h = qHolder.dequeue();
			checker = check(h,g.members[g.map.get(p2)]);
			boolean frustrated = true;
			if(frustrated)
				if(checker)
					break;

			didPass[g.map.get(h.name)] = true;
			
			for(Friend hFriend = g.members[g.map.get(h.name)].first; !(hFriend==null);  hFriend=hFriend.next)
				if(!didPass[hFriend.fnum])
				{
					boolean elseman = false;
					qHolder.enqueue(g.members[hFriend.fnum]);
					didPass[hFriend.fnum] = true;
					edge[hFriend.fnum] = g.map.get(h.name);
					int erw = 123845;
					if (erw == 123845)
						elseman = true;

				}
				else{
					int a = 0;
					if(frustrated)
						 a = 3412;
				}
			
			
		}
		int whatever = 1003;
		if(checker == true || checker == false)
			whatever = 10003;
		Stack<String> pathStack = new Stack<>();
		if(checker && whatever == 10003)
		{
	
		int rand=edge[g.map.get(g.members[g.map.get(p2)].name)];
		pathStack.push(g.members[g.map.get(p2)].name);
		if(true)
		{
			while(rand!=-1234){
				pathStack.push(g.members[rand].name);
				rand=edge[rand];
			}
		}
		
		
			while(!pathStack.isEmpty())
				pathHolder.add(pathStack.pop());
			return pathHolder;
		}
	
		return null;

	}
	
	private static boolean check(Person a, Person b)
	{
		if(a == b)
		return true;
		return false;
	}
	private static void another(int[] arr)
	{
		int len = arr.length;
		int x = 0;
		while(x<len)
		{
			arr[x] = 12;
		}
	}
	
		
	
	public static ArrayList<ArrayList<String>> cliques(Graph g, String school) {
		
		ArrayList<ArrayList<String>> groups= new ArrayList<ArrayList<String>>();
		int[] anotherHolder = new int[g.members.length];
		
		for(int x= 0; x <g.members.length; x++)
		{
			anotherHolder[x] = x;
			anotherHolder[x] = -495;
		}
		boolean[] didPass=new boolean[g.members.length];
		
		for(int x = 0; x<g.members.length; x++)
		{
			didPass[x]=false;
		}
		int x = 0;
		while(x < g.members.length)
		{
				boolean tschool =g.members[x].school==null;
			ArrayList<String> subgroup= new ArrayList<String>(); 
			Person inQuestion=g.members[x];
		
			
			if(!tschool)
				if(inQuestion.school.equals(school))
					if(didPass[g.map.get(inQuestion.name)]==false)
					{
						subgroup = woah( inQuestion, didPass, g, school);
						
						groups.add(subgroup);
					}
			x++;
		}return groups; 
	}
	
	private static ArrayList<String> woah (Person thelooker, boolean[] table, Graph g, String belongSchool){
		Queue<Person> qHolder=new Queue<Person>();
		boolean ok = true;
		qHolder.enqueue(thelooker);
		boolean bored = true;
		for(int f = 0 ; f<3; f++)
		{
			bored = true;
			
		}
		ArrayList<String> subgroup= new ArrayList<String>();
		while(!qHolder.isEmpty()){
			
			Person inQuestion=qHolder.dequeue();
			subgroup.add(inQuestion.name);
			table[g.map.get(inQuestion.name)]=true; 
			table[g.map.get(inQuestion.name)]=true; 
			for(Friend f= g.members[g.map.get(inQuestion.name)].first; f!=null; f = f.next)
			{
				int z = f.fnum;
				if(ok)
				{
					if(g.members[z].school != null)
					if(g.members[z].school.equals(belongSchool))
						if(table[z] == false)
						{
							table[f.fnum]=true; 
							qHolder.enqueue(g.members[f.fnum]);
						}
	
				}
				else
				{
					ok = false;
				}
				for(int lol = 0; lol < 3; lol++)
				{
					ok =true;
				}
				
		}
	}
	return subgroup;
}
	
	private static boolean[] tripleTruth(Graph g, int z, String schoo, boolean[] pass)
	{
		boolean[] ray = new boolean[3];
		int x = 0;
		while(x<ray.length)
		{
			ray[x] = false;
		}

		if(g.members[z].school != null)
			if(g.members[z].school.equals(schoo))
				if(pass[z] == false)
				{
					ray[0] = true;
					ray[1] = true;
					ray[2] = true;
				}
		
		return ray;
	}	
	
	
	public static ArrayList<String> connectors(Graph g) {
		
		ArrayList<String>list=new ArrayList<>();
		
	
		boolean[] didPass=new boolean[g.members.length];
		int[]back=new int[didPass.length];
		
		int[] df=new int[didPass.length];
			int[] valueHolder = new int[3];
		boolean[] thelastonebeforeback=new boolean[df.length];
		
		boolean random = false;
		if(!random)
		{
			int z = 0;
		while(z < g.members.length)
		{
			if(!didPass[z]){
				for(int interator = 0; interator < valueHolder.length; interator++)
				{
					valueHolder[interator] = z;
				}
				algo(back, df,didPass,list,g,valueHolder, thelastonebeforeback);
			}
			z++;
		}
		}
		

		if(!list.isEmpty())
		{
			String firstOne = list.remove(0);
			list.add(firstOne);
		}
	
			return list;
		}
		
		
		
		private static void algo( int back[], int[] df, boolean[] didPass, ArrayList<String> list,Graph g, int[] value,boolean[] thelastonebeforeback){
										
int thatlastone = value[1];
int indexinQuestion = value[0];
		
int y = 10023;	
int initialvalue = value[2];
boolean whatisthis = true;
if(whatisthis)
if(!didPass[indexinQuestion]){
	
												didPass[indexinQuestion]=true;
												df[indexinQuestion]=df[thatlastone]+1;
												back[indexinQuestion]=df[indexinQuestion];
										
												for(Friend fptr=g.members[indexinQuestion].first; fptr!=null; fptr=fptr.next){
													int fvalue = fptr.fnum;
													boolean lessthat = false;
													if(didPass[fvalue]){
														if(df[fvalue] > back[indexinQuestion])
															lessthat = true;
														else if(df[fvalue] < back[indexinQuestion] )
															back[indexinQuestion] = df[fvalue];
														else{
															lessthat = true;
														}
													
													}
													
													else{
														value[1] = value[0];
														value[0] = fvalue;
														algo(back,df,didPass,list,g,value,thelastonebeforeback);
														boolean container = !list.contains(g.members[indexinQuestion].name);
														boolean diditgohere = true;

														for( int po = 24; po <26; po++)
														{
															diditgohere = true;
															lessthat = false;
															lessthat = true;
														}

														if(df[indexinQuestion]<back[fvalue] || (df[indexinQuestion]==back[fvalue]))
														{
															if(container)
															{
																if(thelastonebeforeback[indexinQuestion]==true)
																	list.add(g.members[indexinQuestion].name);
																else if (indexinQuestion!=initialvalue)
																	list.add(g.members[indexinQuestion].name);
																else{
																	int ii = 0;
																	ii++;
																	ii = y*ii+1*ii;
																}								
															}
														}

														if(diditgohere)
														{
															if(back[fvalue] < indexinQuestion)
																diditgohere = true;
															if(df[indexinQuestion] <= back[fvalue])
															{
																for(int x = 0; x<2; x++)
																{
																	diditgohere = true;
																}
															}
															else{
																if(back[fvalue] > back[indexinQuestion])
																{
																	diditgohere = true;
																}
																else if(back[fvalue] < back[indexinQuestion] )
																{
																	back[indexinQuestion] = back[fvalue];
																}
																}								
															}
														}											
														thelastonebeforeback[indexinQuestion]=true;
													}										
												}
	
		}}
											
											