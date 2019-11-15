package InnerClass;

public class LocalOuter {
		private int x=5;
		public void outerLocal()
		{
			System.out.println("in outer");
		
			class LocalInner
			{
				private int y=10;
				public void InnerLocal()
				{
					System.out.println("X="+x);
					System.out.println("y="+y);
				}
				
			}
			LocalInner lo =new LocalInner();
			lo.InnerLocal();
		}
}
		
