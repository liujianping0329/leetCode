import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main40 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("常用角色:5主管8巡修员9前台;常用条线:6保洁14保安");
        System.out.println("人员元数据用格式：人名_电话&人名2_电话2");
        String source=scanner.nextLine();
        System.out.println("依次输入user，account，account_privilege，account_category_r表应从哪个id开始，一行一个id");
        int userId=scanner.nextInt();
        int accountId=scanner.nextInt();
        int accountPrivilegeId=scanner.nextInt();
        int accountCategoryRId=scanner.nextInt();
        System.out.println("依次输入第一个用户的工号样例，角色id，项目id，条线id，一行一个数值");
        int userNoSample=scanner.nextInt();
        int roleId=scanner.nextInt();
        int projectId=scanner.nextInt();
        int lineId=scanner.nextInt();
        System.out.println("生成sql。。。");

        List<String> data=new ArrayList<>();
        if(source.contains("&")){
            for (String s : source.split("&")) {
                data.add(s);
            }
        }else{
            data.add(source);
        }

        for (String datum : data) {
            String name=datum.split("_")[0];
            String tel=datum.split("_")[1];
            System.out.println("--"+datum);
            System.out.println("--user");
            System.out.println("INSERT INTO `ifw_user`.`user` (`id`, `login_name`, `password`, `name`, `status`, `code_no`, `gender`, `phone`, `email`, `uuid`, `icon`, `background`, `remark`, `create_at`, `create_by`, `update_at`, `update_by`) VALUES " +
                    "('"+userId+"', '"+userNoSample+"', '"+tel+"', '"+name+"', '1', '"+userNoSample+"', 'M', '"+tel+"', NULL, NULL, NULL, NULL, NULL, '2019-04-19 10:31:11', '1', NULL, NULL);");
            System.out.println("--account");
            System.out.println("INSERT INTO `ifw_user`.`account` (`id`, `user_id`, `role_id`, `create_at`, `create_by`) VALUES ('"+accountId+"', '"+userId+"', '"+roleId+"', '2019-04-19 11:32:33', '1');");
            System.out.println("--account_privilege");
            System.out.println("INSERT INTO `ifw_user`.`account_privilege` (`id`, `account_id`, `target_type`, `target_id`, `create_at`, `create_by`) VALUES ('"+accountPrivilegeId+"', '"+accountId+"', '1', '"+projectId+"', '2019-04-19 11:36:09', '1');");
            System.out.println("--account_category_r");
            System.out.println("INSERT INTO `ifw_user`.`account_category_r` (`id`, `account_id`, `category`, `is_owner`, `create_at`, `create_by`) VALUES ('"+accountCategoryRId+"', '"+accountId+"', '"+lineId+"', '0', '2019-04-19 11:41:21', '1');");

            userId++;
            accountId++;
            accountPrivilegeId++;
            accountCategoryRId++;
            userNoSample++;
        }
    }
}
