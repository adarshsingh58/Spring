Spring - Annotation Based Configuration: From Spring 2.5 we can use Annottaions on compnent BEan class itslef instead of XMls to define SPring proerties. To use annotations first we need todefine it in xml as:  <context:annotation-config/>
 Now we can use annotations in our Bean class.
Note: Autowiring is processed before XML so any wiring or setting in XML will overried the settings done through annotations.
Common Annotations are:
1.	@Required
The @Required annotation applies to bean property setter methods.

2	@Autowired
The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.

3	@Qualifier
The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.

4	JSR-250 Annotations
Spring supports JSR-250 based annotations which include @Resource, @PostConstruct and @PreDestroy annotations.