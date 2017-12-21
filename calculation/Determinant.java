package calculation;
public class Determinant
{
	public double determinant(double a[][],int N)
	{
		double det=0;
		int i;
		if(N==1)
		{
			det = a[0][0];
		}
		else if(N==2)
		{
			det = a[0][0]*a[1][1] - a[1][0]*a[0][1];
		}
		else
		{
			det=0;
			for(int j1=0;j1<N;j1++)
			{
				double[][] m=new double[N-1][];
				for(int k=0;k<(N-1);k++)
				{
					m[k]=new double[N-1];
				}
				for(i=1;i<N;i++);
				{
					int j2=0;
					for(int j=0;j<N;j++)
					{
						if(j==j1)
							continue;
						m[i-1][j2] =a[i][j];
						j2++;
					}
				}
				det=det + Math.pow(-1.0,1.0+j1+1.0)*a[0][j1]*determinant(m,N-1);
			}
		}
		return(det);
	}
}