import java.util.LinkedList;


public class Node {

	int 					value;
	Position				position;
	LinkedList<Integer>  	possibleValues  = new LinkedList<Integer>();
	
	
	public Node(Position location){
		this.position = location;
		value = 0;
		
		for(int i = 1; i <= 9; i++)
			possibleValues.add(i);
	}

	public LinkedList<Integer> setValue(int val){
		if(value != 0){
			return(null);
		}
		
		value = val;
		LinkedList<Integer>  	possibleValues = this.possibleValues;
		this.possibleValues = null;
		return(possibleValues);
	}
	
	public int getValue(){
		return(value);
	}
	
	public LinkedList<Integer> getPossibleValues(){
		return(possibleValues);
	}

	
	public Boolean removePossibleValue(int val){
		if(value == 0){ // Node not set
			Integer intVal = new Integer(val);
			if(possibleValues.contains(intVal)){
				possibleValues.remove(intVal);
				return(true);
			}
			return(false);
		}
		return(false);
	}

	public Boolean canHaveValue(int val){
		return(possibleValues.contains(new Integer(val)));
	}
	
	public Position getPosition(){
		return(position);
	}
	
	public String toString(){
		if (value == 0)
			return(" ");
		else
			return(Integer.toString(value));
	}
	
	public String possibleValuesToString(){
		StringBuffer	str = new StringBuffer();

        if (possibleValues != null){
            for (Integer val : possibleValues){
                str.append(val.toString() + " ");
            }
        }
		return(str.toString());
	}
	
}
