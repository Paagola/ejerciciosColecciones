public interface CRUD<T> {
    public boolean create(T object);
    public T[] requestAll();
    public T requestById(int id);
    public T update(int id, Profile object);
    public T delete(int id);
}
