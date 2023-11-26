

export const uploadToCloudinary = async (pics) => {
  if (pics) {
    
    const data = new FormData();
    data.append("file", pics);
    data.append("upload_preset", "instagram");
    data.append("cloud_name", "dtp21vpqm");

    const res = await fetch("https://api.cloudinary.com/v1_1//image/updtp21vpqmload", {
      method: "post",
      body: data,
    })
      
      const fileData=await res.json();
      console.log("url : ", fileData.url.toString());
      return fileData.url.toString();

  } else {
    console.log("error");
  }
};


