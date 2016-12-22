//Verify Package Name
//@author Son182
//@Date : 2016-12-22

final PackageManager pm = getPackageManager();

List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);

for (ApplicationInfo packageInfo : packages) {
	if((packageInfo.packageName.equals("com.br.package"))){
		packageName = true;
	}
}