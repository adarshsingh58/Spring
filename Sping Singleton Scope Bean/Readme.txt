Singleton Beans:
If a scope is set to singleton, the Spring IoC container creates exactly one instance 
of the object defined by that bean definition.

This single instance is stored in a cache of such singleton beans, and all subsequent requests
and references for that named bean return the cached object.

The default scope is always singleton.