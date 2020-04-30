


		                      class Hello {
							  
								public static void main(String[] as){
								
									System.out.println("Hello : "+as[0]);
									System.out.println(as[1]);
								}
							  
							  }
							  
							  
							  
							  
							  Student : 
							  
							  Array[Student]
							  
							  
							  i) Register
							  ii) Search
							  iii) Update
							  iv) Delete
							  
							  Select choice : 1/2/3/4
							  
							  i) Enter Student Name
							  
							  ii) Enter Roll no
							  
							  iii) Enter Address
							  
							  iv) Phone
							  
							  Save
							  
							  
							  Do want to continue : Y/N
							  
							  Enter roll NO : 25
							  
							  Detail : 
							  
							  Update :
							  
							  
							  Enter roll;
							  
							  Detail:
							  
							  i) Name ii)Phone iii) Address
							  
							  
							  
							  Type of variables:
							  
							  i) instance variable
							  ii) local variable
							  iii) static variable
							  
							  class Student{
								  
								  String name;
								  String phone;
								  long age;
								  static String clg_Name = "GNDU";
								  
								  
								  
								  
								  public int sum(int a, int b){
									  int c = 0;
									  
									  c =a+b;
									  
									  return c;
									  
								  }
								  
								  
								  
							  }
							  
							  Static rolls:
							  
							  i) we can directily call static inside static
							  ii) we can't call directly non static inside static
							  iii) we can call static inside non static directily
							  
							  
							  
							  
							  
							  Constructor :
							  
							  it is special type of method wich have a same name of it's class.
							  
							  it has no return type even void because it implicitly return class type object.
							  
							  java provide us a default constructor.
								
							 the main pepose of constructor i.e to intialize deault values to instance variable
								
								int  : 0;
                                double : 0.0
                                float : 0.0f
                                String : null;     								
							  
							 this & supeer keyword on constructor


							 this();
							 super();


							 Object :

							 i) getClass();
                             ii) hashCode();
                             iii)toString()
							 iv) wait()
							 v) wait(int nanoSec)
							 vi) wait(int nanoSec, long millsec)
							 vii) notify()
							 viii) notifyAll()
							 ix) clone()
							 x) RegisterNative()
							 xi)equals()
							 xii)finalize()
							 
							 
							  
							  OOPS :
							  
							  It's provide reuseability
							  
							  We have four paradigams in OPPS:
							  
							  i) Enacapsulation
							  ii) inheritance
							  iii) Abstaction
							  iv)Polymorfism
							  
							  
							  i) Encapsulation;
							  
							  The data members should be private and the member functions sould be public
							  
							  shadowing
							  
							  
							  ["1230","2546","5848","58794","5689"]
							  
							  Inheritance:
							  
							  extends
							  
							  abstraction : 
							  
							  When we have a partial information 
							  
							  Polymorphism :
							  
							  it's greek word. Poly  : Many 
											   Morpphism : Files
											   
								i) Overloading : inheritance not important
								ii) Overriding : must have inheritance
								
								Overloading : 
								rules : 
								i) Method name should be same.
								ii) Parameters must be different
								iii) return type can be change
								iv) access modifier can also be change
								
								Overriding : 
								rules :
								
								i) inheritance must 
								ii) Method name must be same
								iii) Parameter must be same
								iv) can be change
								v) also can be change
								
								
								Type of polyorphism;
								
								i) We can create an array of parent class
								ii) we can use co-variant
								iii) Type cast
								
								Interface :  When we are not sure about the functionality
								
								it is pure abstart class.
								
								all the method which we declare inside an interface they all are public,abstart and static by default
								
								Keyword : implements
								
								Gobal Variable : public static final String TEST = "test";
								
								Marker Interface :which don't have any method even a single
								
								Funcationl interface : which have only a single method

								interface in 1.8 : 
								
								javae introduce one new keyword : default
								
								5 -> 6
								
								2 -> 3
						
								Difference b/w abstart and interface
								
								i) still we can't extends more than one class but we can implements more than  one interface
								ii) we have a constructor in abstart class but in interface we don't have
								iii) we can have instance variables in abstart class but inn an interface we don't have 
								
								
								9/4/2020
								
								String : 
								
								It's predefine class. it's a final class. it's a complete class.
								it's immutable class :  
								
								it override below method from object class:
								
								i) toString
								ii) equals
								iii) getBytes();
								iv) charAt();
								v) indexOf();
								vi) subString();
								vii) valueOf()
								viii) lastIndexOf()
								ix) 
								
									Sahil Sharma
									01234567891011
									Revrse String
									Sort String
								
								StringBuffer : mutable class
								
								i) toString();
								ThreadSafe
								
								StringBuilder : Final,Mutable, non-thread safe, version : 1.5
								
								StringBuilder vs StringBuffer
								
								Wrapper classes :
								
								int -----    Integer
								float -----  Float
								long ----    Long
								char -----   Character
								double ----  Double
								boolean ---- Boolean
								byte -----   Byte
								short -----  Short
								
								
								Number : abstart : typeValue() type for Particular type : 
								
								All Wrapper class are final. 
								
									""+2+5+7+5+7 : 25757
									"2"+5+7+5+7
									"2"+"5"+7+5+7
									"25"+"7"+5+7
								     "257"+"5"+7
								     "2575"+"7"
									 "25757"
								
								i) Boxing
								
									int i = 10;
									Integer ii = new Integer(i);
									
								ii) Unboxing
									
									int iii = ii.intValue();
								
								iii) Autoboxing
								
									Integer in = i;
									int j = in;
									
									
									ArrayList al = new ArrayList();
									al.add(55);
									
									
									char c = 'a'
								Character ch = new Character(c);
								
								
								Boolean :
								
								Boolean b1= new Boolean(String str)
								Boolean b2= new Boolean(boolean b)
								
								Exception Handling : 
								
								Unwanted situation
								
								We have five keyword :

								i) try
								ii) catch
								iii) finally
								iv) throw
								v) throws
								
								Possible Combination of Try/catch/finally
								
								i) try{
									
								}catch(ex){
									
								}
								
								ii) try{
									
									}catch(ex){
									
									}finally{
									
									}							
								
								iii) try{
									
									}finally{
										
									}	
								iv) try{
									
									}catch(ArrayIndexOutOfBoundsException ex){
										
									}catch(ArithmeticException ex){
										
									}catch(Exception e){
										
									}
								v) try{
									
									}catch(ex1|ex2|ex3|ex4){
										
									}catch(Exception){
										
									}		
								
								
								Non-possible :
								
								i) try{
									
									}
								ii) catch(ex){
									
									}
								iii) catch(ex){
									
									}finally{
										
									}
								
								
								Thread : 
								
								1) Thread
								2) Runnable
								
								1) Thread Class:
								
									it is concrete class
									
									run();
									start();
									
									git init
								https://superuser.com/questions/1412078/bring-a-local-folder-to-remote-git-repo
								conEmu

								
								Collection:
								
								Collection vs Array
								
								Array : i) Homogenious/Type safe ii) fixed Size iii) reduce type casting 
								
								Collection : i) Hitrogenious/ Not type safe 
											ii) Not size issue
								
								
								Collection : In collection we have 9 key interfaces
								
								1) Collection(I) (1.0)
								2) List (1.2)
									i) ArrayList(1.2)
									ii) LinkedList(1.2)
									iii) Vector (1.0) 
									iv) Stack (1.0)
								
								3) Set(I) (1.2)
									i) HashSet (1.2)
									ii) LinkedHashSet (1.4)
								4) SortedSet(I) (1.2)
								5) NavigableSet(I) (1.6)
									i) TreeSet (1.2)
								6) Queue(I) (1.5)
									i) PriorityQueue
									ii) BlockingQueue	
										a)PriorityBlockingQueue
										b) LinkedBlockingQueue
								7)Map(I) (1.2)
									i) HashMap (1.2)
									ii) LinkedHashMap (1.4)
								8) SortedMap(I) (1.2)
								9) NavigableMap(I) (1.6)
									i) TreeMap (1.2)
								a) WeekedHashMap (1.2)
								b) IdentityHashMap (1.4)
								c) Dictonary
								   i) HashTable(1.0)	
										i)Properties (1.0) 
								
								
									Collection(I) : 
									
										i) add(Object obj)
										ii) iterator()
										iii) remove(Object obj)
										iv) size()
										v) clear()
										vi)contain(Object obj) true/false
										vii) containAll(Collection cl)
										viii) get(Object obj)
										ix) isEmpty()
										x)removeAll(collection cl)
										
								
										i) ArrayList
											
											i) hitrogenious
											ii) default size 10;
											iii) Load Factor : nc = (cc*3/2)+1		
											iv) RandomAccess, Serializable
											v) insertion orer preserved
											vi) duplication allowed
										NC = (10*3/2)+1 = 16
												(16*3/2)+1 = 25
										
										
											16+1/2
											
											newCapacity = oldCapacity + (oldCapacity >> 1);
								
											1010:10  = 0101:5
											10+(5) = 15
											15 +(15>>1)
											8421
											1111: 15 = 0111:7
											15+7 : 22		
										
											Curser in Collection
											
											i) iterator
											ii) listIterator
											iii) Enumeration
											
										LinkedList : 

									    i) Hitrogenision
										ii) insertion order preserved
										iii) serialable
										iv) insertion and deletion operation 	
											
										
								
										vector: 
										
										i) Hitrogenious
										ii) Legacy
										iii) RandomAccess and Serializable
										iv) default size : 10
										v) Load Factor : NC = CC *2
									
										ArrayList vs Vector
										
										i) 1.2                     : i)    1.0 legacy
										ii)this is not thread safe : ii) thread safe

										Stack :
										
										i) Hitrogenious
										ii) Legacy
										iii) Serializable
										iv) 
										
										 
										
										Set : 
										
										HashSet : 
										
										i) Hitrogenious
										ii) Serializable
										iii) insertion order not preserved
										iv) duplication not allowed
										
										LinkedHashSet : 
										
										i) Hitrogenious
										ii) Serializable
										iii) duplication not allowed
										iv) insertion order preserved
										
										SortedSet -> NavigableSet -> TreeSet
										
										
										Map : 

										i) key can't be duplicate
										ii) value can be duplicate
										key : value

										i) put(Object key, Object value);
										ii) putAll(Map);
										
										
										
										Generic : 
										
										<?>
										
										DB : 
										
										JSP : Java Server Pages
										
										Html vs Jsp
										
										i) Java code not allowed  i) We can write java code in jsp
										ii) No need to strat server again and again ii) Same here
										
										9 implicit objects

										i) out
										ii) exception
										iii) page
										iv) request
										v) response
										vi) context
										vii) session
										viii) PageContext
										ix) application
										
										
										Jsp scripting elements : Client side tecnology
										
										i) scriplet tag  <% %>
										ii) declaration  <%! %>
										iii) expression <%= %>
										
										Life cycle of JSP:
										
										i) init
										ii) Service
										iii) destroy
										
										
										Servlet : Server side technology 
										
										Life cycle of servlet : 
										
										i) init
										ii) service
										iii) destroy
										iv) doGet
										v) doPost
										
										Spring Framework
										
										EJB =  Enterprise java beans -> heavy weight
										Spring : ->  light weight
										initial name : interface21 -> org.spring
										winter -> -20 spring 
										
										
										interface AA{
											
											
										}
										class A implements AA{
											
											
										}
										class B implements AA{
											
										}
										
										class C implements AA{
											
										}
										
										class XYZ{
											AA aa;
											
											XYZ(AA aa){
												this.aa = aa;
												
											}
											
										}
										
										Type of Spring container
										
										i) Basic Container : Bean Factory ->  Lazy Container
										ii) advanced container : ApplicationContext -> Ealier/eager container
										iii) MVC container   : 
										
										Spring Advantages
										
										Spring MVC Supports
											1) From Backup Supprot
											2) Controller
												i) MultiAction Controller
												ii) MultiForm Controller
											3) Validation Support
											4) I18N
											5) Intercepters
											6) ViewResolver
											7) Exception Handling  
										
										
										
										
										
										
										
										
										
	
										
										
										

										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
								
								
								
								
								
								


								
									
									
								
								
								
								

									
								
								
								
								
											
								
								
								
								

					

								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							  
							    