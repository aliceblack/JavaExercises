public class D extends C{//es 3.11.3
	public int m(C ref){
		if(ref instanceof C) {return super.m(ref);}
		else{return 4;}
	}
}
