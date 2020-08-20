public class TableDemo4 {
  public static void main(String[] args) {
    RUser userA = new RUser(1, "老大");
    RUser userB = new RUser(2, "老二");
    Role roleA = new Role(1L, "系统配置");
    Role roleB = new Role(2L, "备份服务");
    Role roleC = new Role(3L, "人事管理");
    Power powerA = new Power(1001L, "系统初始化");
    Power powerB = new Power(1002L, "系统还原");
    Power powerC = new Power(1003L, "系统环境修改");
    Power powerD = new Power(2001L, "备份员工数据");
    Power powerE = new Power(2002L, "系统部门数据");
    Power powerF = new Power(3001L, "系统公文数据");
    Power powerG = new Power(4001L, "增加员工");
    Power powerH = new Power(4002L, "浏览员工");
    Power powerI = new Power(4003L, "编辑员工");
    Power powerJ = new Power(4004L, "员工离职");

    roleA.setPowers(new Power[] {powerA, powerB, powerC});
    roleB.setPowers(new Power[] {powerD, powerE, powerF});
    roleC.setPowers(new Power[] {powerG, powerH, powerI, powerJ});

    powerA.setRole(roleA);
    powerB.setRole(roleA);
    powerC.setRole(roleA);
    powerD.setRole(roleB);
    powerE.setRole(roleB);
    powerF.setRole(roleB);
    powerG.setRole(roleC);
    powerH.setRole(roleC);
    powerI.setRole(roleC);
    powerJ.setRole(roleC);

    userA.setRoles(new Role[] {roleA, roleB});
    userB.setRoles(new Role[] {roleA, roleB, roleC});

    roleA.setUsers(new RUser[] {userA, userB});
    roleB.setUsers(new RUser[] {userA, userB});
    roleC.setUsers(new RUser[] {userB});
    System.out.println("通过用户查找信息");
    System.out.println(userA.getInfo());
    System.out.println(userB.getInfo());
    System.out.println("-----------------------");
    for (int i = 0; i < userB.getRoles().length; i++) {
      System.out.println("\t-|" + userB.getRoles()[i].getInfo());
      for (int j = 0; j < userB.getRoles()[i].getPowers().length; j++) {
        System.out.println("\t\t-|" + userB.getRoles()[i].getPowers()[i].getInfo());
      }
    }
    System.out.println("通过角色查找信息");
    System.out.println(roleB.getInfo());
    System.out.println("\t-浏览此角色下的所有权限信息");
    for (int i = 0; i < roleB.getPowers().length; i++) {
      System.out.println("\t\t-|" + roleB.getPowers()[i].getInfo());
    }
    System.out.println("\t-浏览此角色下的所有用户信息");
    for (int i = 0; i < roleB.getUsers().length; i++) {
      System.out.println("\t\t-|" + roleB.getUsers()[i].getInfo());
    }
    System.out.println("通过权限查找信息");
    System.out.println(powerA.getInfo());
    for (int i = 0; i < powerA.getRole().getUsers().length; i++) {
      System.out.println("\t-|" + powerA.getRole().getUsers()[i].getInfo());
    }
  }
}
