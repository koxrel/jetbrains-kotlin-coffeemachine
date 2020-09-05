// write the classes here
data class OperatingSystem(var name: String = "Default")

data class DualBoot(
        var primaryOs: OperatingSystem = OperatingSystem(),
        var secondaryOs: OperatingSystem = OperatingSystem()
)