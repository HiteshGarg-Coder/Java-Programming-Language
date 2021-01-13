class Builder
{
   public static void main(String [] rk)     {
	StringBuilder b = new StringBuilder("abcdef");
	//b.delete(4,6);
	b.ensureCapacity(22);
	System.out.print(b.capacity()+"\n");	
	b.ensureCapacity(23);
	System.out.print(b.capacity());
    }
}
