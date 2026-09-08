public class InnerMemoryDemoTest {

    public static void main(String[] args) {
        
    

        @MemoryDemoTest
      /**
       * MemoryDemoTest
       */
      public class MemoryDemoTest {
      
        
      }  void separateObjectsDoNotSharestate(){
            // arrage
            BankAccount acc1 = new BankAccount();
            BankAccount acc2 = new BankAccount();
            // act
            acc1.balance = 500;
            // Assert
            assertEquals(0, acc2.balance);

        }
         @MemoryDemoTest
         void aliasedObjectShareState(){
            // Arrange
            BankAccount acc1 = new BankAccount();
            acc1.balance = 500;
            BankAccount acc2 = acc1;
            // Act
            acc2.balance = 750;
            // Assert
            assertEquals(750, acc1.balance);
         }
        }
    }

    
