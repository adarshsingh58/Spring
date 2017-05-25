@PostConstruct
@PreDestroy

WIth these annotations we are rescued from using init-method and destroy-method in our XML bean definition.

The method annoted with these annotations will get executed post bean initializtion and before bean destruction automatically.