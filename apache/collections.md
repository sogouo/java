#### CollectionUtils.isEmpty()

```java
import org.apache.commons.collections.CollectionUtils;


/**
     * Null-safe check if the specified collection is empty.
     * <p>
     * Null returns true.
     * 
     * @param coll  the collection to check, may be null
     * @return true if empty or null
     * @since Commons Collections 3.2
     */
    public static boolean isEmpty(Collection coll) {
        return (coll == null || coll.isEmpty());
    }
```

```java
import org.springframework.util.CollectionUtils
  
public abstract class CollectionUtils {
    public CollectionUtils() {
    }

    public static boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
```

[org.apache.commons.collections4 CollectionUtils](https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/CollectionUtils.html)

[Java之Apache Commons-Collections4使用精讲（Bag、Map、List、Set全覆盖）](https://cloud.tencent.com/developer/article/1497565)

[工具类学习-CollectionUtils](https://cloud.tencent.com/developer/article/1495108)

