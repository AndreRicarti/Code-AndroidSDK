//Get Signature hashCode .jks
//@author Son182
//@Date : 2016-12-20

Signature[] sigs = new Signature[0];
        
try {
	sigs = getBaseContext().getPackageManager().getPackageInfo(getBaseContext().getPackageName(), PackageManager.GET_SIGNATURES).signatures;
} catch (PackageManager.NameNotFoundException e) {
	e.printStackTrace();
}

for (Signature sig : sigs) {
	Log.d("MyApp", "Signature hashcode : " + sig.hashCode());
}