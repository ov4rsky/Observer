
	public class PlusTenObs extends Observer{
		
		public PlusTenObs(Subject subject){
			this.subject = subject;
			this.subject.attach(this);
		}
		public void update(){
			System.out.println("Plus Ten: "+subject.getstate()+10);
		} 
	}

