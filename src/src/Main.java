import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            boolean check = true;
            do {
                System.out.println("1: Nhập thông tin công ty.\n" +
                        "2: Phân bổ Nhân viên vào Trưởng phòng.\n" +
                        "3: Thêm, xóa thông tin một nhân sự. Lưu ý khi xóa trưởng phòng, phải ngắt liên kết với các nhân viên đang tham chiếu tới.\n" +
                        "4: Xuất ra thông tin toàn bộ người trong công ty.\n" +
                        "5: Tính và xuất tổng lương cho toàn công ty.\n" +
                        "6: Tìm Nhân viên thường có lương cao nhất.\n" +
                        "7: Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất.\n" +
                        "8: Sắp xếp nhân viên toàn công ty theo thứ tự abc.\n" +
                        "9: Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần.\n" +
                        "10: Tìm Giám Đốc có số lượng cổ phần nhiều nhất.\n" +
                        "11: Tính và Xuất tổng THU NHẬP của từng Giám Đốc.\n" +
                        "12: Exit \n");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                sc.nextLine();
                switch(choice) {
                    case 1:
                        boolean Companycheck = false;
                        if (!Companycheck) {
                            System.out.println("Name Company :");
                            String companyName = sc.nextLine();
                            System.out.println("Tax Number Company :");
                            String taxNumber = sc.nextLine();
                            System.out.println("Monthly Revenue Company :");
                            double monthlyRevenue = sc.nextDouble();

                        Company company= new Company(companyName , taxNumber ,monthlyRevenue);
                            System.out.println("Name Company :"+company.getCompanyName());
                            System.out.println("Tax Number Company :"+company.getTaxNumber());
                            System.out.println("Monthly Revenue Company :"+company.getMonthlyRevenue());
                        } else {
                            System.out.println("Thông tin công ty đã được nhập trước đó.");
                        }
                        break;
                    case 2:


                    // case ....
                    case 12:
                        System.out.println("Are you sure ? (Y or N)");
                        String exit = sc.next();
                        if(exit.equals("Y")) {
                            check = false;
                            System.out.println("Good Bye");
                        }
                        break;
                    default:
                        System.out.println("ReChoice option. We just have 12 choice");
                }
            } while(check);

    }
}