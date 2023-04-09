/**
 * 客户端
 * @author ldd
 */
public class Client {
   public static void main(String[] args) {
      Approver flightJohn = new Staff("张飞");
      //此处使用链式编程配置责任链
      flightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CFO("刘备"));

      //直接找专员张飞审批
      flightJohn.approve(1000);
      /***********************
       审批通过。【专员：张飞】
       ***********************/

      flightJohn.approve(4000);
      /***********************
       无权审批，升级处理。【专员：张飞】
       审批通过。【经理：关羽】
       ***********************/

      flightJohn.approve(9000);
      /***********************
       无权审批，升级处理。【专员：张飞】
       无权审批，升级处理。【经理：关羽】
       审批通过。【CEO：刘备】
       ***********************/

      flightJohn.approve(88000);
      /***********************
       无权审批，升级处理。【专员：张飞】
       无权审批，升级处理。【经理：关羽】
       驳回申请。【CEO：刘备】
       ***********************/
   }
}