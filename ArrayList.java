class  ArrayList implements ListADT
{
    private int total;
    private Object[] list;
    int current,size;

    public ArrayList()
    {
        List();
    }

    public void List()
    {
        current= -1;
        total = 100;
        size=0;
        list = new Object[total];

    }

    public void add(Object e) throws Exception
    {
        if (full())
        {
            throw new Exception("List is full");
        }else
        {
            size++;
            if (size==1)
            {
                current++;
                list[current]=e;
            }
            else
            {
                for(int i=size-1;i>current+1;i--)
                    list[i]=list[i-1];
                current++;
                list[current] = e;
            }

        }
    }

    public Object retrieve() throws Exception
    {
        if (empty())
        {
            throw new Exception("List is empty");
        }
        else
        {
            return list[current];
        }
    }

    public void delete() throws Exception
    {
        if (empty())
        {
            throw new Exception("List is empty");
        }else
        {
            if (size == 1)
                current = -1;
            else if (current==size-1)
                current = 0;
            else
            {
                for(int i=current;i<size-1;i++) list[i]=list[i+1];
                current = 0;
            }
            size--;
        }
    }

    public boolean empty()
    {
        return size == 0;
    }

    public boolean full()
    {
        return size == total;
    }
    public void update(Object e) throws Exception
    {
        if (empty())
        {
            throw new Exception("List is empty");
        }else
        {
            list[current] = e;
        }
    }

    public void findFirst() throws Exception
    {
        if (empty())
        {
            throw new Exception("List is empty");
        }else
        {
            current=0;
        }
    }

    public void findNext() throws Exception
    {
        if (empty())
        {
            throw new Exception("List is empty");
        }else
        {
            if (current != size-1)
                current = current+1;
        }
    }

    public int findkey(Object tKey) throws Exception {

		return SeqSearch(tKey);

    }

    public int SeqSearch( Object key ) throws Exception
    {
        try {
            int position = -1;
            boolean found = false;
            int i  = 0;
            while (!found && i<total) {
                if ((int) list[i] == (int) key) {
                    found = true;
                    position = i;
                }
                i++;
            }
            if (found) position = i-1;
            return position;
        } catch (Exception e) {
            throw new Exception("Not Found");
        }

    }

    public int getSize()
    {
        return size;
    }

    public void printAll(){
        for (int i=0;i<size ;i++ )
        {
            System.out.print(list[i]+ " ");
        }
        System.out.println();
    }
}