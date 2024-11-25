
class Vertex implements Comparable<Vertex>{
   public String label;
   public Object obj;
   
   public Vertex(String vertexLabel) {
	      this.label = vertexLabel;
	   }
   
   public Vertex(String vertexLabel, Object obj) {
	   this.label = vertexLabel;
	   this.obj = obj;
   }
   
   @Override
   public int compareTo(Vertex v) {
	   return label.compareTo(v.label);
   }
}
